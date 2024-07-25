package com.example.demo.model;

import java.util.EnumSet;
import java.util.Set;

import static com.example.demo.model.CteCamposEnum.TipoServico.*;

public enum CteCamposEnum {

    // Campos para Roteiro e viagem
    FRETE_TOTAL_CTE("Frete Total Cte", EnumSet.of(ROTEIRO, VIAGEM, PEDIDO)),
    VALOR_MERCADORIA_CTE("Valor Mercadoria Cte", EnumSet.of(ROTEIRO, VIAGEM)),
    VALOR_FRETE_CTE("Valor Frete Cte", EnumSet.of(ROTEIRO, VIAGEM, PEDIDO)),
    GRIS_CTE("GRIS Cte", EnumSet.of(ROTEIRO, VIAGEM, PEDIDO)),
    ADV_CTE("ADV Cte", EnumSet.of(ROTEIRO, VIAGEM, PEDIDO)),
    PEDAGIO_CTE("Pedágio Cte", EnumSet.of(ROTEIRO, VIAGEM)),
    AJUDANTE_CTE("Ajudante Cte", EnumSet.of(ROTEIRO, VIAGEM)),
    OUTROS_CTE("Outros Cte", EnumSet.of(ROTEIRO, VIAGEM)),
    DESCRICAO_TAG("Descrição Tag", EnumSet.of(ROTEIRO, VIAGEM)),
    ESCOLTA_CTE("Escolta Cte", EnumSet.of(ROTEIRO, VIAGEM)),

    // Campos para Pedido
    TOTAL_NFE_CTE("Total Nfe Cte", EnumSet.of(PEDIDO)),
    FRETE_ADICIONAL_CTE("Frete Adicional Cte", EnumSet.of(PEDIDO)),
    ALIQUOTA_ICMS_CTE("Aliquota ICMS Cte", EnumSet.of(PEDIDO)),
    VALOR_ICMS("Valor ICMS", EnumSet.of(PEDIDO)),
    PESO_BASE_CALCULO_CTE("Peso Base Cálculo Cte", EnumSet.of(PEDIDO));

    private final String displayName;
    private final Set<TipoServico> tiposServicos;

    CteCamposEnum(String displayName, Set<TipoServico> tiposServicos) {
        this.displayName = displayName;
        this.tiposServicos = tiposServicos;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Set<TipoServico> getTiposServicos() {
        return tiposServicos;
    }

    @Override
    public String toString() {
        return displayName + " (" + tiposServicos + ")";
    }

    public enum TipoServico {
        ROTEIRO,
        VIAGEM,
        PEDIDO;
    }
}