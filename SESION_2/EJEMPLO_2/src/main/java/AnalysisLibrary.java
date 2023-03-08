public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception {
        if(!validateJSON(json)) {
            throw new Exception("La información no tiene formato JSON");
        }

        //Procesa la información obtenida en JSON
        System.out.println("Procesando la información...");
    }

    public boolean validateJSON(String data) {
        //Valida si la informacion llega en formato JSON

        return true;
    }
}