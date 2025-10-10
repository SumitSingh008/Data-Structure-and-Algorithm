package STRING;

// string builder ki jarrurat kyu pdhi kyuki string is immutable to performance poor h isiliye hum string builder use krte h 
public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("Hello");

        // str.append(" null");
        // System.out.println(str);
        // // stringBuilder me setCharAt(idx, ch) isse hum same string me change kr skte
        // h
        // str.setCharAt(0, 'm'); // are yr " "- iske andr string likha jata h or single
        // column' ' ke andr char
        // // agr "" lga diye to glt ho jayega
        // System.out.println(str);

        // // insert(idx, ch) and deleteCharAt(ch);
        // str.insert(2, 'y');
        // System.out.println(str);
        // str.deleteCharAt(2);
        // System.out.println(str);

        // reverse() and delete(i,j);
        StringBuilder str = new StringBuilder("Sumit");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
    }
}
