package net.bytebuddy.description.field;

import java.lang.reflect.Field;

public class FieldDescriptionForLoadedFieldTest extends AbstractFieldDescriptionTest {

    @Override
    protected FieldDescription.InDeclaredForm describe(Field field) {
        return new FieldDescription.ForLoadedField(field);
    }
}
