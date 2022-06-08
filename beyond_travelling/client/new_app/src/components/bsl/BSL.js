import React, { useState, useEffect } from 'react';
import RegionList from './RegionList';
import { Row } from 'react-bootstrap';
import './BSL.css';


const BSL = () => {
    const [regions, setRegions] = useState([]);


    useEffect(() => {
        getRegions();
    }, [])


    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))

    }
        
    return (
        <>
        <>     
        <div className="main-container">
            <RegionList regions={regions}/>
        </div>
        </>
        </>

    );
};

export default BSL;