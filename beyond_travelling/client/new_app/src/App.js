import React , { useState } from 'react';
import './App.css';
import AccessibleHotels from './components/wheelchair/AccessibleHotels';
import Header from './components/Header'
// import MainPage from './containers/MainPage';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './containers/Home';
import BSL from './components/bsl/BSL';
// import Card from 'react-bootstrap/Card'
import Button from 'react-bootstrap/Button';
import Footer from './components/Footer';


function App () {

  const [wheelchair, setWheelchair] = useState(false);
  const [bsl, setBsl] = useState(false); 
// initial state to false

  if (wheelchair === false && bsl === false) {
    return (
        <>
        <Home />
        <br></br><br></br>
        {/* Bootstrap button created with a hook. when user clicks on button, it leads them to wheelchair hotels list */}
        <Button variant="light" onClick = { () => {setWheelchair(true)} }>Wheelchair hotels</Button>
        <Button variant="light" onClick = { () => {setBsl(true)} }>BSL hotels</Button>  
        <Footer />
        </>
      );
    
  } else if (wheelchair === true) {

    return (
        <>
        <Header />
        {/* <Button variant="light" onClick = { setWheelchair(false) }>Wheelchair to go to hotels</Button>  */}
        <AccessibleHotels />
        <Button variant="light" onClick = { () => {setWheelchair(false)} }>GO BACK</Button>
        <Footer />
        </>
    
        );

  }else if (bsl === true) {
      return (
        <>
        <BSL />
        <Button variant="light" onClick = { () => {setBsl(false)} }>GO BACK</Button>
        <Footer/>
        </>
      )
  }
  
};

export default App;
