package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Remark;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";

    //Adapted from https://github.com/se-edu/addressbook-level3/commit/556cbd0e03ff224d7a68afba171ad2eb0ce56bbf
    //Default remark changed from "" to some non-empty string
    public static final String DEFAULT_REMARK = "random friend";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Set<Tag> tags;

    //@@author cheeheng-reused
    //Reused from https://github.com/se-edu/addressbook-level3/commit/ce998c37e65b92d35c91d28c7822cd139c2c0a5c
    //#diff-c4705f0e6c86ae58f17f0dd1cec5b1abc7614ae894187cfe901068b6d6fb012d
    private Remark remark;
    //@@author

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();

        //@@author cheeheng-reused
        //Reused from https://github.com/se-edu/addressbook-level3/commit/ce998c37e65b92d35c91d28c7822cd139c2c0a5c
        //#diff-c4705f0e6c86ae58f17f0dd1cec5b1abc7614ae894187cfe901068b6d6fb012d
        remark = new Remark(DEFAULT_REMARK);
        //@@author
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        address = personToCopy.getAddress();
        tags = new HashSet<>(personToCopy.getTags());

        //@@author cheeheng-reused
        //Reused from https://github.com/se-edu/addressbook-level3/commit/ce998c37e65b92d35c91d28c7822cd139c2c0a5c
        //#diff-c4705f0e6c86ae58f17f0dd1cec5b1abc7614ae894187cfe901068b6d6fb012d
        remark = personToCopy.getRemark();
        //@@author
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    //@@author cheeheng-reused
    //Reused from https://github.com/se-edu/addressbook-level3/commit/ce998c37e65b92d35c91d28c7822cd139c2c0a5c
    //#diff-c4705f0e6c86ae58f17f0dd1cec5b1abc7614ae894187cfe901068b6d6fb012d
    /**
     * Sets the {@code Remark} of the {@code Person} that we are building.
     */
    public PersonBuilder withRemark(String remark) {
        this.remark = new Remark(remark);
        return this;
    }
    //@@author

    /**
     * Builds a {@code Person} from this instance of {@code PersonBuilder} object.
     *
     * @return {@code Person} corresponding to the {@code PersonBuilder} object.
     */
    public Person build() {
        //@@author cheeheng-reused
        //Reused from https://github.com/se-edu/addressbook-level3/commit/ce998c37e65b92d35c91d28c7822cd139c2c0a5c
        //#diff-c4705f0e6c86ae58f17f0dd1cec5b1abc7614ae894187cfe901068b6d6fb012d
        return new Person(name, phone, email, address, tags, remark);
        //@@author
    }

}
