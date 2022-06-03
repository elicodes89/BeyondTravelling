import React, { useState } from "react";
import HotelDetail from "./HotelDetail";
import Button from "react-bootstrap/Button";
import ComplexButton from "./ComplexButton";

const HotelList = ({ regions }) => {
  const [selectedRegion, setSelectedRegion] = useState(null);

  const regionsItems = regions.map((region, index) => {
    return (
      <div className="regions_images">
        <ComplexButton variant="light" onClick={() => onRegionClick(region)}>
          {region.name}
        </ComplexButton>
      </div>
    );
  });

  const onRegionClick = function (region) {
    setSelectedRegion(region);
  };

  if (selectedRegion) {
    return (
      <div>
        <ul>
          <HotelDetail region={selectedRegion} />
        </ul>
      </div>
    );
  } else if (!selectedRegion) {
    return (
      <div>
        <ul>
          <h1>Hello from hotel list</h1>
          <ComplexButton />
          {/* {regionsItems} */}
        </ul>
      </div>
    );
  }
};

export default HotelList;
