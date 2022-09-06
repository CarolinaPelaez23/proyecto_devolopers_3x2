package developers3x2.proyecto.service;

import developers3x2.proyecto.entidad.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EnterpriseService implements IEnterpriseService {
    @Override
    public Enterprise findById(int id) {

        Enterprise empresa = new Enterprise();
        List<Transaction> movimientos = new ArrayList<Transaction>();
        Transaction movimiento1 = new Transaction("Compra de equipo", -34567.8, true);
        Transaction movimiento2 = new Transaction("Venta de servicio", 200000.0, true);
        Transaction movimiento3 = new Transaction("Pago de servicios", -100045.8, true);
        Transaction movimiento4 = new Transaction("Arrendamiento de servidor", 4500000.0, true);
        movimiento1.setId(1);
        movimiento2.setId(2);
        movimiento3.setId(3);
        movimiento4.setId(4);

        movimientos.add(movimiento1);
        movimientos.add(movimiento2);
        movimientos.add(movimiento3);
        movimientos.add(movimiento4);

        empresa.setId(1);
        empresa.setTransactions((ArrayList<Transaction>) movimientos);
        empresa.setName("Bancolombia");
        empresa.setDocument("34.234.345");
        empresa.setPhone("6947849");
        empresa.setAddress("Cl 15 5 21");
        empresa.setCreatedAt(new Date());
        empresa.setEstado(true);

        return empresa;
    }

    @Override
    public List<Enterprise> findAll() {

        List<Enterprise> enterprises = new ArrayList<Enterprise>();
        List<Transaction> movimientos = new ArrayList<Transaction>();
        Transaction movimiento1 = new Transaction("Compra de equipo", -34567.8, true);
        Transaction movimiento2 = new Transaction( "Venta de servicio", 200000.0, true);
        Transaction movimiento3 = new Transaction("Pago de servicios", -100045.8, true);
        Transaction movimiento4 = new Transaction("Arrendamiento de servidor", 4500000.0, true);
        movimiento1.setId(1);
        movimiento2.setId(2);
        movimiento3.setId(3);
        movimiento4.setId(4);

        movimientos.add(movimiento1);
        movimientos.add(movimiento2);
        movimientos.add(movimiento3);
        movimientos.add(movimiento4);

        Enterprise empresa1 = new Enterprise();
        empresa1.setId(1);
        empresa1.setName("Bancolombia");
        empresa1.setDocument("34.234.345");
        empresa1.setPhone("6947849");
        empresa1.setAddress("Cl 15 5 21");
        empresa1.setCreatedAt(new Date());
        empresa1.setEstado(true);
        empresa1.setTransactions((ArrayList<Transaction>) movimientos);

        enterprises.add(empresa1);

        Enterprise empresa2 = new Enterprise();
        empresa2.setId(2);
        empresa2.setName("Colpatria");
        empresa2.setDocument("900.090.325");
        empresa2.setPhone("415618");
        empresa2.setAddress("Cl 22 110 12");
        empresa2.setCreatedAt(new Date());
        empresa2.setEstado(true);
        empresa2.setTransactions((ArrayList<Transaction>) movimientos);
        enterprises.add(empresa2);

        return enterprises;
    }




    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise newEmpresa = new Enterprise();
        newEmpresa.setId(empresa.getId());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setDocument(empresa.getDocument());
        newEmpresa.setPhone(empresa.getPhone());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setCreatedAt(new Date());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }


    @Override
    public Enterprise updateEnterprise(int id, Enterprise empresa) {
        Enterprise newEmpresa = findById(id);

        newEmpresa.setId(empresa.getId());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setDocument(empresa.getDocument());
        newEmpresa.setPhone(empresa.getPhone());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setUpdatedAt(new Date());
        newEmpresa.setEstado(empresa.isEstado());
        return newEmpresa;
    }

    @Override
    public void deleteEnterprise(int id) {
        Enterprise empresa1 = findById(id);
    }


}
