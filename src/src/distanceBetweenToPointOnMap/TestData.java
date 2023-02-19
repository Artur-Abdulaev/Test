package distanceBetweenToPointOnMap;

import java.io.IOException;

import static distanceBetweenToPointOnMap.ExcelReader.excelReaderActualOffices;
import static distanceBetweenToPointOnMap.ExcelReader.excelReaderPotentialOffices;



class TestData {

    static StringBuilder actualOffice;
    static StringBuilder potentialOffice;
    static {
        try {
            potentialOffice = excelReaderPotentialOffices("C:/Users/А/Desktop/ExcelForPOI/PotentialOffices.xlsx");
            actualOffice = excelReaderActualOffices("C:/Users/А/Desktop/ExcelForPOI/Test.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder ActualOfficesRawData = actualOffice;
    public static StringBuilder PotentialOfficesRawData = potentialOffice;


}