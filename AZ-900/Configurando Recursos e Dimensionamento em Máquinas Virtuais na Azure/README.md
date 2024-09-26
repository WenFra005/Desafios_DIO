# Configurando Recursos e Dimensionamento em Máquinas Virtuais na Azure

As **Máquinas Virtuais (VMs)** são componentes fundamentais na **Microsoft Azure**, permitindo que você execute aplicações e serviços de forma escalável e controlada. Uma parte essencial do uso de VMs na Azure é a configuração dos recursos e o dimensionamento (ou escalabilidade), que garantem que as VMs sejam adequadas para as cargas de trabalho e que possam se ajustar conforme a demanda.



## 1. Configuração de Recursos em Máquinas Virtuais

Ao configurar uma VM na Azure, você pode especificar vários aspectos que influenciam no desempenho, custos e segurança da sua infraestrutura. Esses aspectos incluem o tipo de VM, o armazenamento, a rede e outros detalhes importantes.

### a) Escolha do Tamanho da VM

A Azure oferece uma grande variedade de tamanhos de máquinas virtuais, cada um otimizado para diferentes tipos de cargas de trabalho. Esses tamanhos podem ser classificados em algumas categorias:

- **General Purpose (Propósito Geral)**: Combinação equilibrada de recursos de CPU e memória. Ideal para servidores web e pequenas bases de dados.
  - Exemplo: **D-series**.
  
- **Compute Optimized (Otimizado para Computação)**: Alta relação de CPU em relação à memória. Ideal para processamento intensivo.
  - Exemplo: **F-series**.
  
- **Memory Optimized (Otimizado para Memória)**: Projetado para aplicativos que exigem muita memória, como grandes bancos de dados.
  - Exemplo: **E-series**, **M-series**.

- **Storage Optimized (Otimizado para Armazenamento)**: Oferece desempenho de I/O alto, ideal para bancos de dados NoSQL.
  - Exemplo: **L-series**.

- **GPU (Processamento Gráfico)**: Usado para cargas de trabalho que exigem alto processamento gráfico, como IA e renderização 3D.
  - Exemplo: **NC-series**, **NV-series**.

### b) Discos e Armazenamento

A Azure oferece diferentes tipos de discos, categorizados por desempenho e custo:

- **Discos Ultra SSD**: Altíssimo desempenho e baixa latência, ideal para cargas de trabalho críticas.
- **Discos Premium SSD**: Alta performance para aplicações de produção.
- **Discos Standard SSD**: Opção econômica com bom desempenho.
- **Discos Standard HDD**: Ideal para desenvolvimento e testes com custos reduzidos.

### c) Rede Virtual (VNet)

Ao configurar uma VM, ela deve ser associada a uma **Rede Virtual (VNet)**, que oferece comunicação entre a VM e outros serviços da Azure. Para segurança adicional, **Network Security Groups (NSG)** podem ser usados para controlar o tráfego de entrada e saída.

### d) Sistema Operacional

Você pode escolher entre várias distribuições de sistemas operacionais ao criar uma VM:

- **Windows Server**
- **Linux** (distribuições como Ubuntu, CentOS, Red Hat, etc.)



## 2. Dimensionamento de Máquinas Virtuais

O **dimensionamento** refere-se à capacidade de ajustar os recursos alocados a uma VM ou a um conjunto de VMs conforme a demanda. Isso garante que sua aplicação possa lidar com picos de tráfego sem comprometer o desempenho, além de otimizar os custos.

### a) Dimensionamento Vertical (Scale Up/Down)

O **dimensionamento vertical** consiste em alterar o tamanho da VM para uma configuração maior ou menor, dependendo das necessidades da aplicação:

- **Scale Up**: Aumenta os recursos da VM (mais CPU, memória, ou disco) para suportar maior carga.
- **Scale Down**: Reduz os recursos da VM quando a demanda diminui, economizando custos.

Esse processo pode ser feito manualmente pela interface do portal da Azure ou programaticamente usando scripts ou a CLI da Azure. No entanto, durante o dimensionamento vertical, a VM precisa ser reiniciada.

### b) Dimensionamento Horizontal (Scale Out/In)
O dimensionamento horizontal adiciona ou remove instâncias de VMs conforme a demanda:

- **Scale Out**: Adiciona mais VMs quando a demanda aumenta.
- **Scale In**: Remove VMs quando a demanda diminui.
Isso é feito usando Azure Virtual Machine Scale Sets (VMSS), que gerenciam grupos de VMs idênticas e podem ser dimensionadas automaticamente com base em métricas como uso de CPU.

### c) Azure Virtual Machine Scale Sets (VMSS)
Os Scale Sets permitem gerenciar e escalonar até milhares de VMs automaticamente. Eles podem ser dimensionados manualmente ou através de autoscaling baseado em regras.