package Zombie;

public class Player extends Human {
    Backpack backpack;

    public Player(String name) {
        super(name);
        backpack = new Backpack();
    }

    public void take(String str) {
        backpack.put(str);
    }

    class Backpack {
        private String staff = "";
        private boolean empty = true;

        public String toString() {
            if (empty) return "the backpack is empty";
            else return staff.substring(0,staff.length()-1) + " in the backpack";
        }

        public void put(String str) {
            staff += str + ",";
            empty = false;
        }
    }
}
