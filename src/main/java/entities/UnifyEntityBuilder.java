package entities;

import interfaces.FillEntityInterface;
import org.apache.commons.csv.CSVRecord;

public class UnifyEntityBuilder implements FillEntityInterface {

    public Object buildEntity(Object entity, CSVRecord record) {
        UnifyEntityInterface libraryEntity = (UnifyEntityInterface) entity;
        libraryEntity.setName(record.get(1));
        libraryEntity.setAddress(record.get(3));
        libraryEntity.setArea(record.get(5));
        libraryEntity.setPhone(record.get(8));

        return libraryEntity;
    }

}
