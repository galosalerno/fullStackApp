import React from "react";
import { useState, useEffect } from "react";
import TextField from "@material-ui/core/TextField";
import Grid from "@material-ui/core/Grid";
import Badge from '@material-ui/core/Badge';

function searchingTerm(term){
  return function(x){
    return x.id.includes(term) ||!term
  }
}

const Paises = () => {
  
  //API Conections with fetch function
  const callService = async () => {
    const response = await fetch("http://localhost:8080/api/country/findAll", {
      method: "GET",
    });
    const data = await response.json();
    console.log(data);
    setPais(data);
  };
  
  //Title
  const titulo = 'Galo Salerno - FullStack Developer JR'
  
  //HOOKS useState y useEffect
  const [paises, setPais] = useState([]);
  const [input, setInput] = useState("");
  
  useEffect(() => {
    callService();
  }, []);


  return (
    <div>
     <div><h1>{titulo}</h1></div>      
      <div>
     
        <h2>Buscador de paises</h2>
        <Grid item>
          <input id="input-with-icon-grid" label="ingrese un pais..." onChange={e => setInput(e.target.value)}/>
        </Grid>
     
      </div>
      <h3>Pais Encontrado</h3>
      <ul>
        {paises.filter(a => a.name.toLowerCase() == input.toLowerCase()).map((item) => (
          <li key="item.id">
            <p>{item.id} - {item.name}</p>
          </li>
        ))}
      </ul>
      <div></div>
    </div>
  );
};

export default Paises;

/* 

<TextField id="input-with-icon-grid" label="ingrese un pais..." value={busqueda} onchange={onChange}/>
<ul>
        <h1>Paises Disponibles</h1>
        {paises.map((item) => (
          <li key="item.id">
            {item.id} - {item.name}
          </li>
        ))}
      </ul>
      <ul>
        <h1>Ingresar nuevo pais</h1>
        
      </ul>
*/
