import React from 'react';
import HotelDetail from './HotelDetail';

const HotelList = ({regions, onRegionClick}) => {

    const regionsItems = regions.map((region, index) => {
      return <HotelDetail region={region} key={index} onRegionClick={onRegionClick} />
    })

  return (
    <div>
    <ul>
      {regionsItems}
    </ul>
  </div>
  )
}

export default HotelList;