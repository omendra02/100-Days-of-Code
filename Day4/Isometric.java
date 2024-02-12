package Day4;

public class Isometric {

    public boolean isIsomorphic(String s, String t) {

        int map1[]=new int[200];
        int map2[]=new int[200];

        if(s.length()!=t.length())
            return false;


        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Isometric isometric = new Isometric();
        
        // Example usage
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' isomorphic? " + isometric.isIsomorphic(s1, t1));
        
        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Are '" + s2 + "' and '" + t2 + "' isomorphic? " + isometric.isIsomorphic(s2, t2));
    }
}
