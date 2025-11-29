package br.com.missio.project.web.clients.dto;


import br.com.missio.project.core.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientViewModel {

    private Long id;

    private String name;

    private String phone;

    private String email;



    public String getPhone(){
        return phone.replaceAll("(\\d{2})(\\d{1})(\\d{4})(\\d{4})", "($1)$2 $3-$4");
    }

    public static ClientViewModel of(Client client){
        return ClientViewModel.builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .phone(client.getPhone())
                .build();
    }
}
