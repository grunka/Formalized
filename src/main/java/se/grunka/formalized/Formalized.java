package se.grunka.formalized;

import javax.servlet.ServletRequest;

public class Formalized {
    private static final String FORM_CONTENT_TYPE = "application/x-www-form-urlencoded";

    public <T> T parse(ServletRequest request, Class<T> type) {
        //return type.newInstance();
        return null;
    }
}
