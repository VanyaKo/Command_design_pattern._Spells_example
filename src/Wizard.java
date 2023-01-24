/**
 * invoker
 */
class Wizard {
    ISpellCommand shrink;
    ISpellCommand makeInvisible;

    Wizard(ISpellCommand shrink, ISpellCommand makeInvisible) {
        this.shrink = shrink;
        this.makeInvisible = makeInvisible;
    }

    void spellShrink() {
        shrink.execute();
    }

    void undoShrink() {
        shrink.unExecute();
    }

    void spellMakeInvisible() {
        makeInvisible.execute();
    }

    void undoMakeInvisible() {
        makeInvisible.unExecute();
    }
}
