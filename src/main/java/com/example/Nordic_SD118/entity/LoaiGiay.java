package com.example.Nordic_SD118.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "loai_giay")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoaiGiay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ten_the_loai")
    private String tenTheLoai;
    @Column(name = "trang_thai")
    private Integer trangThai;

}
