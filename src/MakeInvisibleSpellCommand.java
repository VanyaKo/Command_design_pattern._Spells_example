class MakeInvisibleSpellCommand implements ISpellCommand {
    @Override
    public void execute() {
        System.out.println("The goblin is invisible now!");
    }

    @Override
    public void unExecute() {
        System.out.println("The goblin is visible again...");
    }
}
