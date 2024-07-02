package org.rzampei;

//СОВЕТ Чтобы <b>Запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    public static void main(String[] args) {
        //СОВЕТ Нажмите <shortcut actionId="ShowIntentionActions"/> с курсором на выделенном тексте,
        // чтобы увидеть, как IntelliJ IDEA предлагает его исправить.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //СОВЕТ Нажмите <shortcut actionId="Debug"/>, чтобы начать отладку вашего кода. Мы установили одну <icon src="AllIcons.Debugger.Db_set_breakpoint"/> точку останова
            // для вас, но вы всегда можете добавить больше, нажав <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}