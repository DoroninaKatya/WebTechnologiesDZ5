package interfaces;

import org.apache.commons.csv.CSVRecord;

@FunctionalInterface
public interface FillEntityInterface {
    Object buildEntity(Object entity, CSVRecord record);
}
