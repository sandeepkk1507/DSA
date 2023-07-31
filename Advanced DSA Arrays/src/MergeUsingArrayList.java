import java.util.ArrayList;

// Definition for an interval.


public class MergeUsingArrayList {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<Interval>();
        Interval temp;
        int i;
        for (i = 0; i < intervals.size(); i++) {

            temp = intervals.get(i);
            if (temp.end >= newInterval.start) {
                if (newInterval.end < temp.start) {
                    ans.add(newInterval);
                    return (putall(i, ans, intervals));
                } else {
                    newInterval.start =
                            newInterval.start <= temp.start ? newInterval.start : temp.start;
                    newInterval.end = (temp.end >= newInterval.end) ? temp.end : newInterval.end;
                }
            } else
                ans.add(temp);
        }
        ans.add(newInterval);
        return ans;
    }

    public ArrayList<Interval> putall(int A, ArrayList<Interval> ans,
                                      ArrayList<Interval> intervals) {
        for (int j = A; j < intervals.size(); j++) {
            Interval x = intervals.get(j);
            ans.add(x);
        }
        return ans;
    }


}
