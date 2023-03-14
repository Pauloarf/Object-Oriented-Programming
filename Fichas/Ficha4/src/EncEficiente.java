import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EncEficiente {
    private String name;
    private int nif;
    private String address;
    private int numEncomenda;
    private LocalDate data;
    private List<LinhaEncomenda> linhas;

    public EncEficiente() {
        this.name = null;
        this.nif = 0;
        this.address = null;
        this.numEncomenda = 0;
        this.data = LocalDate.now();
        this.linhas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String name, int nif, String address, int numEncomenda, LocalDate data, List<LinhaEncomenda> linhas) {
        this.name = name;
        this.nif = nif;
        this.address = address;
        this.numEncomenda = numEncomenda;
        this.data = data;
        this.setLinhas(linhas);
    }

    public EncEficiente(EncEficiente encEficiente) {
        this.name = encEficiente.getName();
        this.nif = encEficiente.getNif();
        this.address = encEficiente.getAddress();
        this.numEncomenda = encEficiente.getNumEncomenda();
        this.data = encEficiente.getData();
        this.setLinhas(encEficiente.getLinhas());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNif() {
        return this.nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumEncomenda() {
        return this.numEncomenda;
    }

    public void setNumEncomenda(int numEncomenda) {
        this.numEncomenda = numEncomenda;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<LinhaEncomenda> getLinhas() {
        return this.linhas;
    }

    public void setLinhas(List<LinhaEncomenda> linhas) {
        this.linhas = new ArrayList<>();
        for (LinhaEncomenda l : linhas) {
            this.linhas.add(l.clone());
        }
    }
    public  double calculaValorTotal(){
        double valorTotal = 0;
        for(LinhaEncomenda enc : this.linhas){
            valorTotal += enc.calculaValorLinhaEnc();
        }
        return valorTotal;
    }
    public double calculaValorDesconto(){
        double valorDesconto = 0;
        for(LinhaEncomenda enc : this.linhas){
            valorDesconto += enc.calculaValorDesconto();
        }
        return valorDesconto;
    }
    public int numeroTotalEncomendas(){
        int totalProdutos = 0;
        for(LinhaEncomenda enc : this.linhas){
            totalProdutos += enc.getQuantidade();
        }
        return totalProdutos;
    }
    public boolean existeProdutoEncomenda(String ref){
        for (LinhaEncomenda enc : this.linhas) {
            if(ref.equals(enc.getReferencia()))
                return true;
        }
        return false;
    }
    public void addLinha(LinhaEncomenda linha){
        this.linhas.add(linha.clone());
    }
}