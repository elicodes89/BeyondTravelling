import React from 'react';
import Navbar from 'react-bootstrap/Navbar';
import Container from 'react-bootstrap/Container';
// import './App.css';

function Header () {

return (
   <>
   <Navbar bg="dark" variant="dark">
    <Container>
      <Navbar.Brand href="#home">
        <img
          alt=""
          src="./Travel_Agent_Logo.jpeg"
          width="30"
          height="30"
          // className="d-inline-block align-top"
        />{' '}
      Welcome to Beyond Travelling     
       </Navbar.Brand>
    </Container>
  </Navbar>
   
   </>
    
  );
}
  export default Header;