package songs;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class SongTest {

    public void createAlbum() {

        // 1 liedjes
        Song liedje1 = new Song("test_title", "00:30", 2018);
        System.out.println(liedje1.getDuration());


        // Create album
        List<Song> album = new ArrayList<Song>();
        album.add(new Song("liedje 2", "00:45", 2017));
        album.add(new Song("liedje 3", "00:45", 2017));
        album.add(new Song("liedje 4", "00:45", 2017));
        album.add(new Song("liedje 5", "00:45", 2017));
        album.add(new Song("liedje 6", "00:45", 2017));


        Assertions.assertThat(album).contains(new Song("liedje 3", "00:45", 2017));

        for (Song liedje : album) {
            System.out.println(liedje.toString());
        }

//        for (int i = 1; i < album.size(); i++) {
//            System.out.println(album.get(i).getTitle());
//        }


    }
}
