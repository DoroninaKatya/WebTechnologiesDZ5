package helpers;

import entities.Library;
import entities.Theater;
import interfaces.FillEntityInterface;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class EntityListFactory {

    public static HashSet<Library> getLibraryList(FillEntityInterface builder)
            throws IOException, IllegalAccessException, InstantiationException {
        return new CsvParseHelper<Library>(
                Library.class, getResourceFile("../library.csv")).parse(builder);
    }

    public static HashSet<Theater> getTheaterList(FillEntityInterface builder)
        throws IOException, InstantiationException, IllegalAccessException {
        return new CsvParseHelper<Theater>(
                Theater.class, getResourceFile("../theater.csv")).parse(builder);
    }

    private static File getResourceFile(String filename) {
        return new File(EntityListFactory.class.getResource(filename).getFile());
    }

}
