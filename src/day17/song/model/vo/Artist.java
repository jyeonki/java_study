package day17.song.model.vo;

import java.io.Serializable;
import java.util.List;

// 가수 클래스

// 객체를 파일에 저장하려면 객체를 직렬화해야 하는데
// Serializable 인터페이스를 구현해야 합니다.
public class Artist implements Serializable {

    private String name; // 가수명
    private List<String> songs; // 노래목록

    public Artist(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}