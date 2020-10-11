import com.imooc.List.students;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 */
public class TreeSets {
    public static void main(String[] args) {
        TreeSet<students> students = new TreeSet<students>(new Comparator<com.imooc.List.students>() {
            @Override
            public int compare(com.imooc.List.students o1, com.imooc.List.students o2) {
                return (int)(o2.getScore() - o1.getScore());
            }
        });
        students.add(new students("苏苏",20,99.5));
        students.add(new students("艾萨",18,90.5));
        students.add(new students("苏酒儿",22,95.5));
        System.out.println(students);
    }
}



