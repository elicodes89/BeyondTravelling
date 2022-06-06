import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './containers/Home';
import Header from './components/Header';

// import AccessibleHotels from './components/wheelchair/AccessibleHotels';
// import Header from './components/Header'
// import BSL from './components/bsl/BSL';
// import Button from 'react-bootstrap/Button';
// import Wheelchair from '../src/access_icons/wheelchair.png';
// import Sign from '../src/access_icons/sign.png';
import Footer from './components/Footer';


function App () {

  // const [wheelchair, setWheelchair] = useState(false);
  // const [bsl, setBsl] = useState(false); 
// initial state to false

  // if (wheelchair === false && bsl === false) {
    return (
        <>
        <Header />
        <Home />
        {/* Bootstrap button created with a hook. when user clicks on button, it leads them to wheelchair hotels list */}
        {/* <div className = "homeButtons">
        <div className="flex-container">
          <img onClick = { () => {setWheelchair(true)} } className="images" src={Wheelchair} alt='wheelchairimg' width="500" height="500"/>
          <img onClick = { () => {setBsl(true)} } className="images" src={Sign} alt='signimg' width="500" height="500"/>
        </div>
        </div> */}
        <Footer />
        </>
      );
    
  // } else if (wheelchair === true) {

  //   return (
  //       <>
  //       <Header />
  //       {/* <Button variant="light" onClick = { setWheelchair(false) }>Wheelchair to go to hotels</Button>  */}
  //       <AccessibleHotels />
  //       <Button variant="light" onClick = { () => {setWheelchair(false)} }>GO BACK</Button>

  //       </>
    
  //       );

  // }else if (bsl === true) {
  //     return (
  //       <>
  //       <BSL />
  //       <Button variant="light" onClick = { () => {setBsl(false)} }>GO BACK</Button>
  //       </>
  //     )
  // }
  
};

export default App;
