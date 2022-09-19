package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");

    //@@author cheeheng-reused
    //Reused from https://github.com/se-edu/addressbook-level3/commit/35eb7286f18a029d39cb7a29df8f172a001e4fd8
    //#diff-399c284cb892c20b7c04a69116fcff6ccc0666c5230a1db8e4a9145def8fa4ee
    public static final Prefix PREFIX_REMARK = new Prefix("r/");
    //@@author

    public static final Prefix PREFIX_TAG = new Prefix("t/");

}
