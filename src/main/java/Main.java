import org.sergei.spring.lesson_02.Music;
import org.sergei.spring.lesson_02.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        MusicPlayer mp1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayerBean", MusicPlayer.class);

        mp1.playMusicList();

        System.out.println(mp1);
        System.out.println(mp2);

        System.out.println(mp1 == mp2);

        System.out.println(mp2.getVolume());
        mp1.setVolume(98);
        System.out.println(mp2.getVolume());

        context.close();
    }
}
