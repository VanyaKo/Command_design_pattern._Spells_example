public class Main {

    public static void main(String[] args) {
        Wizard wizard = new Wizard(new ShrinkSpellCommand(), new MakeInvisibleSpellCommand());

        wizard.spellShrink();
        wizard.spellMakeInvisible();
        wizard.undoShrink();
        wizard.undoMakeInvisible();
    }
}
