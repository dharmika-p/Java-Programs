import java.util.*;

public class Main {

    static class Activity {
        int start, finish;

        Activity(int s, int f) {
            start = s;
            finish = f;
        }

        public String toString() {
            return "(" + start + ", " + finish + ")";
        }
    }

    public static List<Activity> selectActivities(List<Activity> list) {
        // Sort by finish time
        list.sort(Comparator.comparingInt(a -> a.finish));

        List<Activity> result = new ArrayList<>();
        int lastFinish = -1;

        for (Activity a : list) {
            if (a.start >= lastFinish) {
                result.add(a);
                lastFinish = a.finish;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Activity> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Activity(sc.nextInt(), sc.nextInt()));
        }

        System.out.println(selectActivities(list));
    }
}



