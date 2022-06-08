import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './containers/Home';
import Header from './components/Header';
import Footer from './components/Footer';


function App () {
    return (
      <div className ="App">
        <>
        <Header />
        <Home />
        {/* <Footer /> */}
        </>
        </div>
      );
  };
  
export default App;
