public interface CapableOfCombat {
    default void canFight (){
        System.out.println("I can fight");
    }

    default void canReport () {
        System.out.println("I can report");
    }
}
