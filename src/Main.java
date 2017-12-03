public class Main {
    public static void main(String[]args){
        String a = "fgfgjfgjdenfggfdgfd";
        String b = "mlajden";

        System.out.println(commonSubstring(a, b));
    }

    private static String commonSubstring (String first, String second){
        String common = "";

//        kjfadkljflkjdflkjsdlkjflsdjflkjsd

        for(int i = 0; i < first.length(); i++){
            if(second.contains(first.charAt(i) + "")){
                int startIndex = second.indexOf(first.charAt(i));

                String candidate = "";

                for(int t = 2; t < second.length() - startIndex + 1; t++){
                    if(i + t < first.length() + 1 && second.contains(first.substring(i, i+t))){
                        candidate = first.substring(i, i+t);
                    }
                }

                if(candidate.length() > common.length()){
                    common = candidate;
                }
            }
        }
        return common;
    }
}
