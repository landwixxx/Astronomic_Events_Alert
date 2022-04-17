package br.edu.utfpr.astronomic_events_alert.model.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="eventos")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Evento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String titulo;
    @NonNull
    private String desc;
    @NonNull
    private Date data;

}
