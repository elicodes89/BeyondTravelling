import React from 'react';
import './App.css';
import MainPage from './containers/MainPage';

function App() {
  return (
    <>
    <div className='title'>
    <h1>Welcome to Beyond Travelling</h1>
    <h2>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>
    <div>
    <img className="bsl_sign" src={require("./access_icons/signingicon.jpeg")} alt='Signing'/>
    </div>
    <div>
    <img className="wheelchair" src={require("./access_icons/wheelchair.jpeg")} alt='Wheelchair'/>
    </div>
<<<<<<< HEAD
    <MainPage />
    
=======
    </div>
>>>>>>> 95120ea (Completed Bsl videos with captions)
    <footer>2022 - Created by Annika, Eli and Mate - </footer>
    </>
  );
}

export default App;
