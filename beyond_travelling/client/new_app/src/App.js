import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './containers/Home';
import Header from './components/Header';
// import Header from './components/Header'
// import BSL from './components/bsl/BSL';
// import Button from 'react-bootstrap/Button';
// import Wheelchair from '../src/access_icons/wheelchair.png';
// import Sign from '../src/access_icons/sign.png';
import Footer from './components/Footer';


function App () {
    return (
      <div className ="App">
        <>
        <Header />
        <Home />
        <Footer />
        </>
        </div>
      );
  };
  
export default App;
