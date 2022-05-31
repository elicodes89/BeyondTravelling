import React from 'react';
import './App.css';
import MainPage from './containers/MainPage';
import 'bootstrap/dist/css/bootstrap.min.css';
import Card from 'react-bootstrap/Card'



function App() {
  return (
    <>
    <div className='title'>
    <h1>Welcome to Beyond Travelling</h1>
    <h2>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>

    <img className="bsl_sign" src={require("./access_icons/signing1.jpeg")} alt='Signing'/>
    <img className="wheelchair" src={require("./access_icons/wheelchair.jpeg")} alt='Wheelchair'/>
    </div>
    <MainPage />
    
    <footer>2022 - Created by Annika, Eli and Mate - </footer>
    </>
  );
}

export default App;
