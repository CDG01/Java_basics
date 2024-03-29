/*
Comparable is an interface defining a strategy of comparing an object with other
objects of the same type. This is called the class’s “natural ordering.”

In order to be able to sort, we must define our Player object as comparable
by implementing the Comparable interface.
 */

package Compare_Explanation.example1_ComparableVersion;

public class Player implements Comparable<Player>{
    private int ranking;
    private String name;
    private int age;

    // constructor, getters, setters

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.getRanking(), otherPlayer.getRanking());
    }

    /*
    The sorting order is decided by the return value of the compareTo() method. The Integer.compare(x, y)
    returns -1 if x is less than y, 0 if they’re equal, and 1 otherwise.

    The method returns a number indicating whether the object being compared is less than, equal to, or greater
    than the object being passed as an argument.
     */
}