package helpers;

import interfaces.FillEntityInterface;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;

class CsvParseHelper<T> {

    private Class entityClass;
    private File parseFile;

    CsvParseHelper(Class entityClass, File parseFile) {
        this.entityClass = entityClass;
        this.parseFile = parseFile;
    }

    @SuppressWarnings("unchecked")
    HashSet<T> parse(FillEntityInterface filler)
            throws IOException, InstantiationException, IllegalAccessException {
        HashSet<T> result = new HashSet<>();

        CSVParser parser = CSVParser.parse(
                this.parseFile, Charset.defaultCharset(), CSVFormat.EXCEL);

        for (CSVRecord record : parser) {
            result.add((T) filler.buildEntity(entityClass.newInstance(), record));
        }

        return result;
    }

}
