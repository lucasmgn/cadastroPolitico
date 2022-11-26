package br.com.sprint4.services.assembler;

import br.com.sprint4.entites.Associado;
import br.com.sprint4.services.dto.request.AssociadoInputDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AssociadoInputDisassembler {
    private final ModelMapper modelMapper;

    public Associado toDomainObject(AssociadoInputDTO associadoInput) {
        return modelMapper.map(associadoInput, Associado.class);
    }

    public void copyToDomainObject(AssociadoInputDTO associadoInput, Associado associado) {
        // Para evitar org.hibernate.HibernateException: identifier of an instance of
        // Entidade was altered from 1 to 2
//        cidade.setEstado(new Estado());

        modelMapper.map(associadoInput, associado);
    }
}
