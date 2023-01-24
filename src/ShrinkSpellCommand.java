class ShrinkSpellCommand implements ISpellCommand {
    @Override
    public void execute() {
        System.out.println("The goblin is quite smaller now!");
    }

    @Override
    public void unExecute() {
        System.out.println("The goblin is in the original height...");
    }
}
