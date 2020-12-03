public class test{
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("A",1);
        st.put("B",9);
        st.put("M",8);
        st.delete("M");

        System.out.println(st.size());
        System.out.println(st.get("A"));
        System.out.println(st.isEmpty());
        System.out.println(st.get("B"));
        System.out.println(st.get("M"));
        
        
        System.out.println(st.contains("K"));

        assert(st.isEmpty() == false);
    }

}