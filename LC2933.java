import java.util.*;

public class LC2933 {
    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        List<String> ls1 = new ArrayList<>();
        ls1.add("ab");
        ls1.add("1025");
        ls.add(ls1);
        List<String> ls2 = new ArrayList<>();
        ls2.add("ab");
        ls2.add("1120");
        ls.add(ls2);
        List<String> ls3 = new ArrayList<>();
        ls3.add("ab");
        ls3.add("1124");
        ls.add(ls3);
        System.out.println(findHighAccessEmployees(ls));
    }
    static List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List <String> ans = new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        for (List<String> accessTime : access_times) {
            if (map.containsKey(accessTime.get(0))) {
                map.get(accessTime.get(0)).add(accessTime.get(1));
            } else {
                map.put(accessTime.get(0), new ArrayList<>(Collections.singletonList(accessTime.get(1))));
            }
        }
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            List<String> list = entry.getValue();
            if(list.size()<3) continue;
            Collections.sort(list);
            int count = 0;
            boolean flag = false;
            for(int i = 1 ; i < list.size() ; i++){
                int dhr = Integer.parseInt(list.get(i).substring(0,2))-Integer.parseInt(list.get(i-1).substring(0,2));
                if(dhr==0){
                    if(!flag){
                        count+=2;
                        flag = true;
                    }
                    else{
                        count++;
                    }
                }
                if(dhr==1){
                    int a = Integer.parseInt(list.get(i-1).substring(2,list.size()+1));
                    int b = Integer.parseInt(list.get(i).substring(2,list.size()+1));
                    int dmr = 60- (a+b);
                    if(dmr<59){
                        if(!flag){
                            count+=2;
                            flag = true;
                        }
                        else{
                            count++;
                        }
                    }
                    else flag = false;
                }
                else flag= false;
            }
            if(count>=3) ans.add(entry.getKey());
        }
        return ans;
    }
}
