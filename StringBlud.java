public class StringBlud {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Tony");
        System.out.println(st);
        System.out.println(st.charAt(0));
        st.setCharAt(0,'P');
        System.out.println(st);
        st.insert(1, 'T');
        System.out.println(st);
        st.delete(1, 2);
        System.out.println(st);
        st.append(" ");
        st.append("S");
        for(int i=0;i<st.length()/2;i++){
            int start=i;
            int end=st.length()-1-i;
            char one = st.charAt(start);
            char sec=st.charAt(end);
            st.setCharAt(start, sec);
            st.setCharAt(end, one);

        }
        System.out.println(st);
    }
}
