package doc;

import org.junit.Test;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;
import org.mapdb.Serializer;


public class htreemap_hashseed {

    @Test
    public void run(){
        DB db = DBMaker.memoryDB().make();
        //#a
        HTreeMap<String, Long> map = db
                .hashMap("map", Serializer.STRING, Serializer.LONG)
                .hashSeed(111) //force Hash Seed value
                .create();
        //#z
    }
}
