package com.tezqa.android.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class EmailValidator {

    private Pattern mPattern;
    private Matcher mMatcher;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Constructor
     */
    public EmailValidator() {
        mPattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Validate hex with regular expression
     *
     * @param email     Email address to validate
     * @return          true for valid email, false for invalid email
     */
    public boolean validate(final String email) {
        mMatcher = mPattern.matcher(email);
        return mMatcher.matches();
    }

}
