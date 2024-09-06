    package empleados;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class InformacionVendedores {
        private String name;
        private String lastName;
        private String typeDocument;
        private Number document;

        // Constructor
        public InformacionVendedores(String typeDocument, int document, String name, String lastName ) {
            this.name = name;
            this.lastName = lastName;
            this.typeDocument = typeDocument;
            this.document = document;
        }

        // Getters && Setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getTypeDocument() {
            return typeDocument;
        }

        public void setTypeDocument(String typeDocument) {
            this.typeDocument = typeDocument;
        }
        
        public Number getDocument() {
            return document;
        }

        public void setDocumentt(Number document) {
            this.document = document;
        }

        // Establecedores y captadores (getters y setters)
    }
