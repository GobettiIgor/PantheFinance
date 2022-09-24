package util;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class MaskCampos {
    public MaskFormatter maskTelefone(JFormattedTextField textfield) throws ParseException {
        MaskFormatter mask = null;
        mask = new MaskFormatter("(##)####-####");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;
    }

    public MaskFormatter maskCpf(JFormattedTextField textfield) throws ParseException {
        MaskFormatter mask = null;
        mask = new MaskFormatter("###.###.###-##");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;
    }

    public MaskFormatter maskCep(JFormattedTextField textfield) throws ParseException {
        MaskFormatter mask = null;
        mask = new MaskFormatter("#####-###");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;
    }

    public MaskFormatter maskCnpj(JFormattedTextField textfield) throws ParseException {
        MaskFormatter mask = null;
        mask = new MaskFormatter("##.###.###/####-##");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;
    }
}
