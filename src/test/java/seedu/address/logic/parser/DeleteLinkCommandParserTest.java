package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.*;
import static seedu.address.logic.parser.CliSyntax.PREFIX_MODULE_CODE;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.DeleteLinkCommand;
import seedu.address.model.link.Link;
import seedu.address.model.module.ModuleCode;


public class DeleteLinkCommandParserTest {
    private DeleteLinkCommandParser parser = new DeleteLinkCommandParser();

    @Test
    public void parse_missingParts_failure() {
        assertParseFailure(parser, " " + PREFIX_MODULE_CODE + VALID_GE3238_MODULE_CODE,
                DeleteLinkCommand.MESSAGE_NOT_EDITED);
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(
                MESSAGE_INVALID_COMMAND_FORMAT, DeleteLinkCommand.MESSAGE_USAGE));
    }

    //Specific testing of link validity performed at ParserUtilTest and LinkTest
    //Integration testing of AddLinkCommandParser with ParserUtil
    @Test
    public void parse_links_success() {
        String moduleCodeString = " " + PREFIX_MODULE_CODE + VALID_MODULE_CODE;
        String moduleLinks = MODULE_LINK_CS2103T;
        String userInput = moduleCodeString + moduleLinks;

        ModuleCode moduleCode = new ModuleCode(VALID_MODULE_CODE);
        Set<Link> expectedLinks = new HashSet<Link>(Arrays.asList(new Link(VALID_MODULE_LINK)));
        DeleteLinkCommand expectedCommand = new DeleteLinkCommand(moduleCode, expectedLinks);

        assertParseSuccess(parser, userInput, expectedCommand);
    }
}
